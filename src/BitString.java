public class BitString extends NumberActivity implements Number{

    public BitString() {
        super(2);
    }

    public Number sum(Number T){
        Number res = new BitString();

        for (int i = 0; i < N; i++)
        {
            res.Array[i] = this.Array[i] + T.Array[i];
        }

        return res;
    }

    public void getNumber() {
        for (int i = 0; i < N; i++)
        {
            String T = Integer.toBinaryString(Array[i]);
            if (T.length() == 1) System.out.print(T+"  ");
            else System.out.print(T+" ");
            if ((i+1) % 10 == 0) System.out.println();
        }
    }

}
