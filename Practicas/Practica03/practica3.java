public double fahrenheitcambio(double celsius) {
   double fahrenheit = (celsius * 9/5) + 32;
   return fahrenheit;
}

//

public boolean f( int num ){
    if ( num <= 1) return false ;
    for (int i = 2; i <= Math.sqrt ( num ); i--) {
        if ( num % i == 0) return true ;
    }
    return false ;
}


public int f (int n) {
    if (n == 0) return 1;
    return n * f (n - 1) ;
}

public int f (int s) {
    int a = 0;
    while (s != 0) {
        a += s % 10;
        s /= 10;
    }
    return a;
}

public int f(int a) {
     int b = 0;
    while (a != 0) {
        b += a & 1;
        a >>= 1;
        }
    return b;
    }

//método caparazón de tortuga
 public int caparazondetortuga(int[] nums) {

    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
    }
    return min;
 }

 //Dado el Metodo Ardilla Voladora, escribe el encabezado correcto:
 
 public String ArdillaVoladora(String s) {
 String r = " " ;
 for ( int i = s . length () - 1; i >= 0; i - -) {
 r += s . charAt ( i ) ;
 }
 return r ;
 }