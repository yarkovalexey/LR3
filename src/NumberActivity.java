/*
 * Created by Alexey Yarkov on 13.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

public class NumberActivity implements Number {

    public NumberActivity(int n) {
        setNumber(n);
    }

    public Number sum(Number T) {
        Number res = new NumberActivity(10);

        for (int i = 0; i < N; i++) {
            res.Array[i] = this.Array[i] + T.Array[i];
        }

        return res;
    }

    public void setNumber(int n) {
        for (int i = 0; i < N; i++) {
            Array[i] = (int) (Math.random() * n);
        }
    }

    public void getNumber() {
        for (int i = 0; i < N; i++) {
            if (Array[i] >= 0 && Array[i] <= 9) System.out.print(Array[i] + "  ");
            else if (Array[i] >= 10) System.out.print(Array[i] + " ");

            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}