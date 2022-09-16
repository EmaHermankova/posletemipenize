public class SendMoney {
    public static void main(String[] args) {
        for (int s = 0; s < 10; s++) {
            for (int e = 0; e < 10; e++) {
                for (int n = 0; n < 10; n++) {
                    for (int m = 0; m < 10; m++) {
                        for (int o = 0; o < 10; o++) {
                            for (int r = 0; r < 10; r++) {
                                for (int y = 0; y < 10; y++) {
                                    for (int d = 0; d < 10; d++) {
                                        if(s*1000 + e*100 + n*10 + d + m*1000 + o*100 + r*10 + e == m*10000 + o*1000 + n*100 + e*10 + y){
                                            if(s!=e && s!=n && s!=d && s!=m && s!=o && s!=r && s!=y && e!=n && e!=d && e!=m && e!=o && e!=r && e!=y && n!=d && n!=m && n!=o && n!=r && n!=y && d!=m && d!=o && d!=r && d!=y && m!=o && m!=r && m!=y && o!=r && o!=y && r!=y){
                                                System.out.println("s: "+s);
                                                System.out.println("e: "+e);
                                                System.out.println("n: "+n);
                                                System.out.println("d: "+d);
                                                System.out.println();
                                                System.out.println("m: "+m);
                                                System.out.println("o: "+o);
                                                System.out.println("r: "+r);
                                                System.out.println("e: "+e);
                                                System.out.println();
                                                System.out.println("m: "+m);
                                                System.out.println("o: "+o);
                                                System.out.println("n: "+n);
                                                System.out.println("e: "+e);
                                                System.out.println("y: "+y);
                                                System.out.println();
                                                System.out.println();
                                            }
                                        }
                                    }
                                }

                            }

                        }

                    }

                }

            }

        }
    }
}
