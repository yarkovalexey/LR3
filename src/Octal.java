/*
 * Created by Alexey Yarkov on 13.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

import java.util.Arrays;

public class Octal extends NumberActivity implements Number {

    public Octal() {
        super(8);
    }

    public Number sum(Number T) {
        Number res = new Octal();

        for (int i = 0; i < N; i++) {
            res.Array[i] = this.Array[i] + T.Array[i];
        }

        return res;
    }

    public void getNumber() {
        for (int i = 0; i < N; i++) {
            String T = Integer.toOctalString(Array[i]);
            if (T.length() == 1) System.out.print(T + "  ");
            else System.out.print(T + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
