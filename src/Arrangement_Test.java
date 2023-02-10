import java.sql.SQLOutput;
import java.util.Scanner;

// **문제 설명
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
class Arrangement_Test {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i=0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        for(int i=0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
        return answer;
    }
    public static void main(String[] args) {

        int count = 0;
        int[] num;

        Scanner stdIn = new Scanner(System.in);
        System.out.print("입력할 숫자의 개수는 ? ");
        count = stdIn.nextInt();
        num = new int[count];

        System.out.print(count + " 개의 숫자를 입력하세요.");
        for (int i=0; i < count; i++){
            num[i] = stdIn.nextInt();
        }

        Arrangement_Test arrangement_test = new Arrangement_Test();
        arrangement_test.solution(num);

    }

}
