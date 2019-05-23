package Test.CallBack;

public class Wang implements CallBack {
    L li;
    CallBack callBack;
    public Wang(L li) {
        this.li = li;
    }

    ;
    public void askQuestion(String question){
        question="?";
        li.doSomething(Wang.this,question);
    }

    @Override
    public void answer(String a) {
        System.out.println(a);
    }
}
