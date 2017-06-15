package com.example.baihatkaraok;

public class BaiHatKaraOk {
	int MaSo;  
	 String TenBH;  
	 String TacGia;  
	  
	 BaiHatKaraOk(int MaSo, String TenBH, String TacGia){  
	 this.MaSo= MaSo;  
	 this.TenBH=TenBH;  
	 this.TacGia= TacGia;  
	 }  
	   
	 public String toString(){
	  return MaSo+" "+TenBH+" "+TacGia;  
	 }  
	 public static void main(String args[]){  
	   BaiHatKaraOk ok1=new BaiHatKaraOk(1001,"Đi để trở về","Tiên Cookie");  
	   BaiHatKaraOk ok2=new BaiHatKaraOk(1002,"Đi về đâu","Tiên Tiên");  
	     
	   System.out.println(ok1);  
	   System.out.println(ok2); 
	 }  
}   