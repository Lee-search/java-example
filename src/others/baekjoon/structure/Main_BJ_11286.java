package others.baekjoon.structure;

/**
 * 절댓값 힙 : https://www.acmicpc.net/problem/11286
 * PriorityQueue와 Comparator 객체 사용
 * Comparator 객체 -> compare 메서드 오버라이드
 * o1과 o2에 대해서 return이 양수이면 ASC, 음수이면 DESC 정렬
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_BJ_11286 {

    static int N;
    static PriorityQueue<Integer> pq;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) {
                    return o1 > 0 ? 1 : -1;    // - 인것을 먼저 앞으로 보냄
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for(int i = 0; i < N; i++) {

            int num = Integer.parseInt(br.readLine());
            if(num == 0) { // pop
                if(pq.peek() == null) {
                    sb.append("0\n");
                } else sb.append(pq.poll()).append("\n");
            }
            else { // push
                pq.offer(num);
            }
        }

        System.out.println(sb);
    }
}
