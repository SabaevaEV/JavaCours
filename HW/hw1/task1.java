package HW;

public class task1 {
    class Answer {
        public int countNTriangle(int n){
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            return sum;
        }
    }
}

