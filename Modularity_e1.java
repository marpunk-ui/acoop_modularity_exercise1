import java.util.Arrays;
import java.util.ArrayList;

public class Modularity_e1 {

public static float avg(int[] nums) throws EmptyArray, NegArray { 
    int sum = 0;
    if (nums == null || nums.length == 0)
        throw new EmptyArray();
    String nint = "";
    String ind = "";
    int nind = 1;
    for(int n: nums) {
      if (n < 0) {
        nint += String.valueOf(n);
        nint += " ";
        ind += String.valueOf(nind);
        ind += " "; }
        nind ++;}
    if (nint.length() > 0) {
      throw new NegArray("", nint, ind);};
    for(int n: nums) sum += n;
    return sum / nums.length;
}
public static void main(String[] args) {
    int[] nums = new int[] {1,-2,-3,4};
    Float result;
    try { result = avg(nums);
//      for (int i: nums) {
//      System.out.println(i);}
    System.out.println(result);} 
    catch(EmptyArray e) {} 
    catch(NegArray e) {
    String nint = e.getNnumerot();
    String ind = e.getIndeksit();
    ArrayList<String> nlista = new ArrayList<String>(Arrays.asList(nint.split(" ")));
    ArrayList<String> ilista = new ArrayList<String>(Arrays.asList(ind.split(" ")));  
    int pituus = ilista.size();
      for (int j=0; j<pituus; j++) {
        String paate = "";
        if (ilista.get(j).equals("1")) {
          paate ="st";}
        else if (ilista.get(j).equals("2")) {
          paate = "nd";}
        else if (ilista.get(j).equals("3")) {
          paate = "rd";}
        else {paate = "th";}       
        System.out.println("The " + ilista.get(j) + paate + " number " + nlista.get(j) + " in your array is invalid");}// 3    
}
}
}

class EmptyArray extends Exception {}

class NegArray extends Exception {
  private String nnumerot;
  private String indeksit;
  public NegArray(String message, String nnumerot, String indeksit) {
    super(message);
    this.nnumerot = nnumerot;
    this.indeksit = indeksit;}
  public String getNnumerot() {
    return this.nnumerot;
  }
  public String getIndeksit() {
    return this.indeksit;
  }  
  } 