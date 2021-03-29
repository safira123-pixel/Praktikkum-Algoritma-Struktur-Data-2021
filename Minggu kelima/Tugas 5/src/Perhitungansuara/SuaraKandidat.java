
package Perhitungansuara;

public class SuaraKandidat {
     public int elemen;
    public String Nama[];
    public double total;
    
    SuaraKandidat(int elemen){
        this.elemen = elemen;
        this.Nama = new String[elemen];
        this.total = 0;
    }
      
    String TotalDC(String arr[], int l, int r){
        if(l==r){
            return arr[l];
        } else if (l<r){
            int mid = (l+r)/2;
            String lsum = TotalDC(arr,l,mid-1);
            String rsum = TotalDC(arr,mid+l,r);
            return lsum+rsum+arr[mid];
        } return null;
    }

    
}
