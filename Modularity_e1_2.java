import java.util.Arrays;
import java.util.ArrayList;

public class Modularity_e1_2 {

public static float avg(int[] nums) throws EmptyArray, NegArray { 
    int sum = 0;
    if (nums == null || nums.length == 0)
        throw new EmptyArray();
    ArrayList<Integer> nint = new ArrayList<>(0);;
    ArrayList<Integer> ind = new ArrayList<>(0);;    
    int ind0 = 1;
    for(int n: nums) {
      if (n < 0) {
        nint.add(Integer.valueOf(n));        
        ind.add(Integer.valueOf(ind0));}
        ind0 ++;}
    if (nint.size() > 0) {
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
    ArrayList nlista = e.getNnumerot();
    ArrayList ilista = e.getIndeksit();
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
  private ArrayList nnumerot;
  private ArrayList indeksit;
  public NegArray(String message, ArrayList nnumerot, ArrayList indeksit) {
    super(message);
    this.nnumerot = nnumerot;
    this.indeksit = indeksit;}
  public ArrayList getNnumerot() {
    return this.nnumerot;
  }
  public ArrayList getIndeksit() {
    return this.indeksit;
  }  
  } 