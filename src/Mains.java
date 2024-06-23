class Short{
    public double hi(Card card, double spend){
        double total = card.purchase( spend );
        return total;
    }
}
class Card {



    double purchase(double spend){
        return 1;
    }
}
class SBIpremiumCard extends Card{

    double discount ;
    double saving;
    double pay;


    public double purchase( double spend){
        if(spend >=5000 && spend < 10000){
            discount = 10;
        }
        else if(spend > 10000){
            discount =15;
        }
        else discount = 2;
        if ( spend !=0 )
        {
            saving = spend * discount / 100;
            pay = spend - saving;
        }

        return pay;
    }
}

class HDFCpremiumCard extends Card{

    double discount ;
    double saving;
    double pay;
    public double purchase(double spend){
        if(spend >=5000 && spend < 10000){
            discount = 12;
        }
        else if(spend > 10000){
            discount =18;
        }
        else discount = 1;
        if(spend !=0){
            saving = spend * discount / 100;
            pay = spend - saving;

        }
        return pay;
    }



}
public class Mains{
    public static void main(String[] args){
       // int discount = 15;
        Card card = new SBIpremiumCard();
        Short sho = new Short();
        double a=sho.hi(card,8000);
        System.out.println(a);
       // Card card2 = new Card(200);
       // System.out.println(card2.purchase());
      // SBIpremiumCard card1 = new SBIpremiumCard(8000);
//        HDFCpremiumCard card1 = new HDFCpremiumCard(4000);
//        card.order();
//        double money =card.purchase();
//        System.out.println(money);
//        double hdfcMoney = card1.purchase();
//        System.out.println(hdfcMoney);
    }
}