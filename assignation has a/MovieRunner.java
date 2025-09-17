class MovieRunner {
    public static void main(String[] args) {
        Video  video = new Video ("gandhda gudi");
		Movie pvr = new Movie(video);
		System.out.println(pvr.name);
        
    }
}