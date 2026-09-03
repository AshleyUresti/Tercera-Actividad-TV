public class TV {
    //atributos
    private int channel;
    private int volumeLevel;
    private boolean on;

    //constructor
    public TV(int channel, int volumeLevel, boolean status) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = status;
    }

    //metodos
    public void turnOn() {
        this.on = true;
        System.out.println("TV encendida");
    }

    public void turnOf() {
        this.on = false;
        System.out.println("TV apagada");
    }

    public void setChannel(int newChannel) {
        if (this.on == true) {
            this.channel = newChannel;
            System.out.println("El programa de TV ha cambiado a " + newChannel);
        } else {
            System.out.println("La TV está apagada");
        }
    }

    public void channelUp() {
        this.channel = this.channel + 1;
        System.out.println("Se ha cambiado al canal " + this.channel);
    }

    public void channelDown() {

        if (this.channel != 0) {
            this.channel = this.channel - 1;
            System.out.println("Se ha cambiado al canal " + this.channel);
        } else {
            System.out.println("El canal actual es 0");
        }
    }

    public void volumeUp() {
        if (this.volumeLevel >= 0 && this.volumeLevel < 100) {
            this.volumeLevel = this.volumeLevel + 1;
            System.out.println("El volumen subió a " + this.volumeLevel);
        }
        if (this.volumeLevel == 100 ) {
            System.out.println("Volumen máximo 100");
        }
    }

    public void volumenDown() {
        if (this.volumeLevel > 0 && this.volumeLevel <= 100) {
            this.volumeLevel = volumeLevel - 1;
            System.out.println("El volumen bajó a " + this.volumeLevel);
        }
        if (this.volumeLevel == 0) {
            System.out.println("El volumen está al mínimo 0");
        }
    }

}
