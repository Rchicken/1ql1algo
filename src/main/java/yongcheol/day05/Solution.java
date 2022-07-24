package yongcheol.day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class Solution {

    public int[] solution(int N, int[] stages) {
        List<Situlation> answer = new ArrayList<>();        // 계산 완료한 값이 저장되는 배열
        Map<Integer, Situlation> result = new HashMap<>();  // 몇명 살아있고 몇명 진행중인지 저장하는 맵 (Round + 진행자 + 총 살아있는 인원)
        boolean[] failer = new boolean[stages.length];      // 실패한 사람 번호


        for (int i = 1; i <= N; i++) {
            result.put(i, new Situlation(i, 0, 0));     // 해당 라운드에 몇명 살이있는지 확인하기 위해 미리 생성
            for (int j = 0; j < stages.length; j++) {
                if (failer[j]) {                            // 만약 죽어있으면 다음으로 넘어감
                    continue;
                }
                if (i == stages[j]) {                       // 현재 라운드랑 진행하고 있는 게 같은 경우 실패자 + 1, 진행 인원 + 1, 해당 인원 실패 표시
                    failer[j] = true;
                    result.get(i).addFailer();
                } else {
                    result.get(i).addUser();                // 이외의 경우는 성공한 것이므로 현재 진행인원 +1
                }
            }
            answer.add(result.get(i));                      // 계산 완료한 값 배열에 넣어두기
        }
        answer.sort((o1, o2) -> o2.getPercent() - o1.getPercent());     // 실패율 기준으로 내림차순 정렬
        return answer.stream().mapToInt(Situlation::getRound).toArray();    // 라운드 기준으로 배열로 반환
    }
}

class Situlation {

    private int round;  // 진행 라운드
    private int fail;   // 실패인원
    private int user;   // 해당 라운드 진행한 인원

    public Situlation(int round, int fail, int user) {
        this.round = round;
        this.fail = fail;
        this.user = user;
    }

    void addFailer() {
        this.fail += 1;
        this.user += 1;
    }

    void addUser() {
        this.user += 1;
    }

    public int getPercent() {
        if (fail == 0 && user == 0) {
            return 0;
        }
        return (int)((double)fail / user * 100);
    }

    public int getRound() {
        return round;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Situlation.class.getSimpleName() + "[", "]")
            .add("round=" + round)
            .add("fail=" + fail)
            .add("user=" + user)
            .toString();
    }
}