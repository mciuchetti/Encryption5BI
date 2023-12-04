class Main {
  public static void main(String[] args) {
    String parolaChiave;
    System.out.println("Inserisci la parola chiave:");
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      parolaChiave = br.readLine();
    }
    catch (IOException io){
      System.err.println("errore lettura dati da tastiera");
    }
  }
}