import lombok.Getter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Getter
public class WordManager {
    DBManager dbManager = new DBManager();
    private List<Word> words;

    public void addWord(Word word) {
        Connection conn = dbManager.getConnection();
        String sql = "INSERT INTO words (english, japanese) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, word.getEnglish());
            pstmt.setString(2, word.getJapanese());
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("単語の追加に失敗しました", e);
        }
    }

    public List<Word> getWords() {
        List<Word> wordList = new ArrayList<>();
        Connection conn = dbManager.getConnection();
        String sql = "SELECT english, japanese FROM words";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             var rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String english = rs.getString("english");
                String japanese = rs.getString("japanese");
                wordList.add(new Word(english, japanese));
            }
        } catch (Exception e) {
            throw new RuntimeException("単語の取得に失敗しました", e);
        }
        return wordList;
    }

    public int getWordCount() {
        Connection conn = dbManager.getConnection();
        String sql = "SELECT COUNT(*) AS count FROM words";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             var rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("count");
            }
        } catch (Exception e) {
            throw new RuntimeException("単語数の取得に失敗しました", e);
        }
        return 0;
    }

    public void deleteWord(String english) {
        Connection conn = dbManager.getConnection();
        String sql = "DELETE FROM words WHERE english = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, english);
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("単語の削除に失敗しました", e);
        }
    }

    public void updateWord(String english, String japanese) {
        Connection conn = dbManager.getConnection();
        String sql = "UPDATE words SET japanese = ? WHERE english = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, japanese);
            pstmt.setString(2, english);
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("単語の更新に失敗しました", e);
        }
    }
}