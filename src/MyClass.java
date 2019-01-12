public class MyClass {
    public void printMsg(String msg){
        System.out.println(msg);
    }
    public void guessMyNumber(int num) {
        int counter = 0;
        double ran = Math.floor(Math.random()*10);
        if(counter > 3) {
            System.out.println("Game over!!");
        }
        if (num < 0 || num > 10) {
            counter++;
            System.out.println("out of boundaries");
        } else {
            counter++;
            if (num == ran){
                System.out.println("Congratulation!! You win!!");
            }
        }
    }
}
