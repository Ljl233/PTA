package Test.CallBack;

public class TestCallBack {
    public static void main(String[] args){
        L li = new L();
        Wang wang= new Wang(li);
        String question="?";
        wang.askQuestion(question);
    }
}
