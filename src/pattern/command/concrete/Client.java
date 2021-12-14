package pattern.command.concrete;

public class Client {

    public static void main(String[] args) {
        // 기능 실행을 위한 호출자를 생성한다.
        Invoker invoker = new Invoker();

        // 리시버를 지정해 커맨드 객체를 생성한 후 호출자에 커맨드 객체를 설정한다.
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);

        // 기능을 실행시킨다. 리시버의 execute()가 호출된다.
        invoker.execute();
    }
}
