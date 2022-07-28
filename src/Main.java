import com.sun.source.tree.ParenthesizedPatternTree;
import com.sun.source.tree.PatternTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Type type1 = new Type(1, "Banka Çalışanı", 0);
        Type type2 = new Type(2, "Kosgeb Çalışanı", 0);

        Employee employee1 = new Employee(1, "5364706328", "ali@gok.com",
                "1234", "Gökberk", "Uğuz", "Davutpaşa Şubesi", type1);

        Employee employee2 = new Employee(1, "5364706328", "ali@gok.com",
                "1234", "Ali", "Uğuz", "Davutpaşa Şubesi", type1);

        Entreprenurs individualEntreprenur1 = new IndividualEntrepreneurs(2,
                "536","aa@bb.com","1234",1,
                55,true,"Ahmet","Osman","1234565");

        Entreprenurs coorparateEntrepreneurs1 = new CoorparateEntrepreneurs(4,"456124548"
                ,"dfs@gfgs.com","12345",2,40,false,"Etiya"
                ,"66545642");

        Role role1 = new Role(1,"Kredi Onaylama");
        Role role2 = new Role(2,"Sisteme Girişi Yapabilme");

        UserRole userRole1 = new UserRole(1,employee1,role1);
        UserRole userRole2 = new UserRole(2,employee2,role2);

        Bank bank1 = new Bank(1,"Halkbank");
        Bank bank2 = new Bank(2,"Ziraat Bankası");

        BankUser bankUser1 = new BankUser(1,employee1,bank1);

        CreditType creditType1 = new CreditType(1,"Girişimci Kredisi");
        CreditType creditType2 = new CreditType(2,"Kobi Kredisi");

        Feature feature1 = new Feature(1,"Alt Limit");
        Feature feature2 = new Feature(2,"Özel Kampanya");
        Feature feature3 = new Feature(3,"Sektör");
        Feature feature4 = new Feature(4,"İl");
        Feature feature5 = new Feature(5,"Destek Oranı");
        Feature feature6 = new Feature(6,"Üst Limit");
        Feature feature7 = new Feature(7,"Kredi Hacmi");
        Feature feature8 = new Feature(8,"Yedek Hacmi");
        Feature feature9 = new Feature(9,"Ölçek");

        Credit credit1 = new Credit(1,"Erzurum Kredisi"
                ,LocalDate.of(2022,07,01),
                LocalDate.of(2024,07,01),creditType1);

        Credit credit2 = new Credit(2,"Yüz Bin Kobi Kredisi",
                LocalDate.of(2022,06,01),
                LocalDate.of(2025,06,01),creditType2);

        CreditFeature creditFeature1 = new CreditFeature(1,credit2,feature5,"0.30");
        CreditFeature creditFeature2 = new CreditFeature(2,credit2,feature6,"300000");
        CreditFeature creditFeature3 = new CreditFeature(3,credit2,feature1,"20000");
        CreditFeature creditFeature4 = new CreditFeature(4,credit2,feature7,"10000000000");
        CreditFeature creditFeature5 = new CreditFeature(5,credit2,feature8,"3000000000");
        CreditFeature creditFeature6 = new CreditFeature(6,credit2,feature9,"600");
        CreditFeature creditFeature8 = new CreditFeature(8,credit1,feature5,"0.25");
        CreditFeature creditFeature9 = new CreditFeature(9,credit1,feature6,"1000000");
        CreditFeature creditFeature10 = new CreditFeature(10,credit1,feature1,"60000");
        CreditFeature creditFeature11 = new CreditFeature(11,credit1,feature7,"1000000000000");
        CreditFeature creditFeature12 = new CreditFeature(12,credit1,feature8,"400000000000");
        CreditFeature creditFeature13 = new CreditFeature(13,credit1,feature9,"650");
        CreditFeature creditFeature14 = new CreditFeature(13,credit1,feature4,"Erzurum");
        CreditFeature creditFeature15 = new CreditFeature(13,credit1,feature3,"Gıda");



        ApplicationPriority applicationPriority1 = new ApplicationPriority(1,"Asil");
        ApplicationPriority applicationPriority2 = new ApplicationPriority(2,"Yedek");

        Application application1 = new Application(1,
                "Accepted",LocalDate.of(2022,01,01),
                individualEntreprenur1,credit1,applicationPriority1);//enum

        Application application2 = new Application(2,"Denied",
                LocalDate.of(2022,01,03),coorparateEntrepreneurs1,credit2,applicationPriority2 );
    }
}