import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {

        // 全モンスターリスト
        List<String> allMonsters = List.of(
                "スライム", "ドラゴン", "ゴブリン", "フェニックス", "ユニコーン"
        );

        // 戦闘履歴（重複あり）
        ArrayList<String> battleHistory = new ArrayList<>();
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("ドラゴン");
        battleHistory.add("ドラゴン");
        battleHistory.add("ゴブリン");
        battleHistory.add("ゴブリン");

        // 発見済みモンスター（重複除去）
        Set<String> discoveredSet = new HashSet<>(battleHistory);
        List<String> discoveredMonsters = new ArrayList<>(discoveredSet);

        // 発見済みモンスター数
        int discoveredCount = discoveredSet.size();

        // スライムとの戦闘回数
        int slimeCount = 0;
        for (String monster : battleHistory) {
            if (monster.equals("スライム")) {
                slimeCount++;
            }
        }

        // 未発見モンスター
        List<String> undiscoveredMonsters = new ArrayList<>();
        for (String monster : allMonsters) {
            if (!discoveredSet.contains(monster)) {
                undiscoveredMonsters.add(monster);
            }
        }

        // 出力
        System.out.println("発見済みモンスター: " + discoveredMonsters);
        System.out.println("発見済みモンスター数: " + discoveredCount);
        System.out.println("スライムとの戦闘回数: " + slimeCount);
        System.out.println("未発見のモンスター: " + undiscoveredMonsters);
    }
}
