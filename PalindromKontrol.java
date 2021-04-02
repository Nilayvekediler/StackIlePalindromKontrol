public class PalindromKontrol {

    boolean palindrom(String dizi)//palindromsa true değilse false döndürür. milim
    {
        Cikin cikin = new Cikin();

        for(int i = 0;i<dizi.length();i++) {
            Eleman<Character> e1;
            e1 = new Eleman<Character>(dizi.charAt(i));
            cikin.cikinEkle(e1); //çıkında şu an m i l i m var. 0 1 2 3 4
        }

        int sayac=dizi.length()-1;
        for(int i = 0;i<dizi.length()/2;i++) {
            if (dizi.charAt(i)==dizi.charAt(sayac)){
                sayac--;
            }else{
                return false;
            }

        }
        return true;
    }

}

