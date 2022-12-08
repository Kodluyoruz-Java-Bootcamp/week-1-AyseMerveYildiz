package QuestionsTen;

import java.util.ArrayList;
import java.util.List;

import QuestionsNine.MyList;

public class Main {

	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<>();
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setCustomerName("Ayşe");
		customer1.setCustomerAge(25);
		customer1.setProductName("Apple iPhone 11 128 GB Beyaz Cep Telefonu Aksesuarsız Kutu");
		customer1.setProductPrice(1700);
		customer1.setProductNumber(1);
		customer1.setInvoiceAmount(1750);

		Customer customer2 = new Customer();
		customer2.setCustomerName("Merve");
		customer2.setCustomerAge(26);
		customer2.setProductName("Maybelline New York Instant Anti Age Eraser Kapatıcı ");
		customer2.setProductPrice(150);
		customer2.setProductName("Arzum OK004 Okka Minio Türk Kahvesi Makinesi");
		customer2.setProductPrice(650);
		customer2.setProductNumber(2);
		customer2.setInvoiceAmount(800);

		Customer customer3 = new Customer();
		customer3.setCustomerName("Cem");
		customer3.setCustomerAge(28);
		customer3.setProductName("FANTOM Pratik Süpürge 500w Gri AIR1000367");
		customer3.setProductPrice(560);
		customer3.setProductName("Slazenger Deri Kordon Erkek Kol Saati");
		customer3.setProductPrice(650);
		customer3.setProductNumber(2);
		customer3.setInvoiceAmount(1210);

		Customer customer4 = new Customer();
		customer4.setCustomerName("Cenk");
		customer4.setCustomerAge(25);
		customer4.setProductName("Microsoft Xbox Series S 512 GB Oyun Konsolu");
		customer4.setProductPrice(1100);
		customer4.setProductName("JBL T560bt Kulak Üstü Bluetooth Kulaklık Pembe");
		customer4.setProductPrice(800);
		customer4.setProductNumber(2);
		customer4.setInvoiceAmount(1900);

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);

		
		// for(Customer newMyList:customerList) {//print metodu
		 System.out.println("Sistemdeki tüm müşetilerin sayısı : " + customerList.size()); //}
		
		System.out.print("Cem isimli müşterinin aldığı ürün sayısı : ");
		for (Customer newMyList : customerList) {
			if (newMyList.getCustomerName().startsWith("Cem")) {
				System.out.println(newMyList.getProductNumber());
			}
		}

		System.out.print("Yaşı 30'dan küçük 25'ten büyük olan Cem isimli müşterinin toplam alış-veriş tutarı : ");
		for (Customer newMyList : customerList) {
			if (newMyList.getCustomerName().startsWith("Cem") && newMyList.getCustomerAge() < 30
					&& newMyList.getCustomerAge() > 25) {
				System.out.println(newMyList.getInvoiceAmount() + " ₺");
			}

		}

		System.out.print("1500 ₺ üzeri faturalar : ");
		for (Customer newMyList : customerList) {
			if(newMyList.getInvoiceAmount()>1500) {
			 
				System.out.println(newMyList.getInvoiceAmount());
			}
			
		}
		
		
	}
}
