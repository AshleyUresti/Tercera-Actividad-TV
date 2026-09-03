public class Main {
    public static void main(String[] args) {
        TV tv = new TV(1, 50, false);

        System.out.println("Estado de la TV");
        System.out.println("canal: 1\nvolumen: 50\nestado: apagada\n");

        tv.turnOn();
        tv.setChannel(5);
        tv.channelUp();
        tv.channelDown();
        tv.volumeUp();
        tv.volumenDown();
        tv.volumenDown();
        tv.turnOf();

    }
}
