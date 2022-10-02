public class binarysearch {
    public static void main(String []args) {
        int [] x={2,3,4,5,6,7,8,9,10,12,14};
        int s,l,m,t=12;
        s=0;
        l = x.length-1;
        while(s<=l){
            m = (s+l)/2;
            if (x[m]<t){
                s = m+1;
            }
            else if(x[m]>t){
                l=m-1;
            }
            else {
                System.out.print(m);
                break;
            }}

    }}

