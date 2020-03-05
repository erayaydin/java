class Calisma5 {

    public static void main(String[] args) {
        Deneme deneme = new Deneme();
        deneme = null;
        System.gc();
    }

}

class Deneme {
    public void dene() {
        System.out.println("Denendi!");
    }

    public void finalize() {
        System.out.println("Deneme sınıfından bir nesne siliniyor...");
    }
}
