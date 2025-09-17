class ChetneyRunner {
    public static void main(String[] args) {
        Dosa dosa = new Dosa("Masala Dosa");
		Chetney chetney = new Chetney(dosa);
		System.out.println(chetney.name);
        //dosa.displayDosa();
    }
}

