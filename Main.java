public class Main {
    public static void main(String[] args) {
        Drum drm = new Drum();
        Guitar gtr = new Guitar();
        Bell bl = new Bell();

        drm.sound();
        gtr.sound();
        bl.sound();
    }
}

class SoundsEx {
    public void instruments() {
        System.out.println("Instrument sounds");
    }
}

class Drum extends SoundsEx {
    public void sound() {
        System.out.println("Ba-dum-tss");
    }
}

class Guitar extends SoundsEx {
    public void sound() {
        System.out.println("Vrumh");
    }
}

class Bell extends SoundsEx {
    public void sound() {
        System.out.println("Ding-dong");
    }
}

