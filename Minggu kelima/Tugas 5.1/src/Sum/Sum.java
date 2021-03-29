
package Sum;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
    
    double TotalBF(double arr[]){
        for(int i = 0; i < elemen; i++ ){
          total = total + arr[i];
        }
        return total;
    }
    
    double TotalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        } else if (l<r){
            int mid = (l+r)/2;
            double lsum = TotalDC(arr,l,mid-1);
            double rsum = TotalDC(arr,mid+l,r);
            return lsum+rsum+arr[mid];
        } return 0;
    }
}
