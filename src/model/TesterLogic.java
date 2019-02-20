package model;

public class TesterLogic {
	public String[] test1(Tester tester){	//自分が親の場合の計算
		//ロン上がりとツモ上がりの2パターンを配列pointsに格納
		String[] points = new String[2];
		int fu = Integer.parseInt(tester.getFu());
		//fuの値の調整
		if(fu >= 26 && fu % 10 != 0){
			fu = (fu/10 +1) *10 ;
		}
		System.out.println("fuの値の調整::" +fu);

		if(tester.getOyako().equals("1")){	//親の時
			switch(tester.getHan()){
				case "1":	//1翻の場合
					if(fu == 30){
						points[0] = "1500";
						points[1] = "500";
					}else if(fu == 40){
						points[0] = "2000";
						points[1] = "700";
					}else if(fu == 50){
						points[0] = "2400";
						points[1] = "800";
					}else if(fu == 60){
						points[0] = "2900";
						points[1] = "1000";
					}else if(fu == 70){
						points[0] = "3400";
						points[1] = "1200";
					}else if(fu == 80){
						points[0] = "3900";
						points[1] = "1300";
					}else if(fu == 90){
						points[0] = "4400";
						points[1] = "1500";
					}else if(fu == 100){
						points[0] = "4800";
						points[1] = "1600";
					}else if(fu == 110){
						points[0] = "5300";
						points[1] = "1800";
					}
					break;
				case "2":	//2翻の場合
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "700";
					}else if(fu == 25){
						//2翻25符は七対子のロン上がりのみ
						points[0] = "2400";
						points[1] = null;
					}else if(fu == 30){
						points[0] = "2900";
						points[1] = "1000";
					}else if(fu == 40){
						points[0] = "3900";
						points[1] = "1300";
					}else if(fu == 50){
						points[0] = "4600";
						points[1] = "1600";
					}else if(fu == 60){
						points[0] = "5800";
						points[1] = "2000";
					}else if(fu == 70){
						points[0] = "6800";
						points[1] = "2300";
					}else if(fu == 80){
						points[0] = "7700";
						points[1] = "2600";
					}else if(fu == 90){
						points[0] = "8700";
						points[1] = "2900";
					}else if(fu == 100){
						points[0] = "9600";
						points[1] = "3200";
					}else if(fu == 110){
						points[0] = "10600";
						points[1] = "3600";
					}
					break;
				case "3":	//3翻の場合
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "1300";
					}else if(fu == 25){
						points[0] = "4800";
						points[1] = "1600";
					}else if(fu == 30){
						points[0] = "5800";
						points[1] = "2000";
					}else if(fu == 40){
						points[0] = "7700";
						points[1] = "2600";
					}else if(fu == 50){
						points[0] = "9600";
						points[1] = "3200";
					}else if(fu == 60){
						points[0] = "11600";
						points[1] = "3900";
					}else{
						points[0] = "12000";
						points[1] = "4000";
					}

					break;
				case "4":	//4翻の場合
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "2600";
					}else if(fu == 25){
						points[0] = "9600";
						points[1] = "3200";
					}else if(fu == 30){
						points[0] = "11600";
						points[1] = "3900";
					}else{ //40符以降はすべて12000・4000
						points[0] = "12000";
						points[1] = "4000";
					}
					break;
				case "5":
					//5翻は満貫のみ
					points[0] = "12000";
					points[1] = "4000";
					break;
				case "6":
				case "7":
					//6翻、7翻は跳満のみ
					points[0] = "18000";
					points[1] = "6000";
					break;
				case "8":
				case "9":
				case "10":
					//8翻、9翻、10翻は倍満のみ
					points[0] = "24000";
					points[1] = "8000";
					break;
				case "11":
				case "12":
					//11翻、12翻は3倍満のみ
					points[0] = "36000";
					points[1] = "12000";
					break;
				case "13":
					//13翻は役満のみ
					points[0] = "48000";
					points[1] = "16000";
					break;
			}
		}

		return points;
	}
	public String[] test2(Tester tester){	//子の場合
		//ロン上がり、ツモ上がり(親と子)の3パターンを配列に格納
		//points[0]がロンの直撃
		//points[1]がツモ(親からもらう点数)
		//points[2]がツモ(子からもらう点数)
		String[] points = new String[3];
		int fu = Integer.parseInt(tester.getFu());
		//fuの値の調整
		if(fu >= 26 && fu % 10 != 0){
			fu = (fu/10 +1) *10 ;
		}
		System.out.println("fuの値の調整::" +fu);

		if(tester.getOyako().equals("2")){	//子の時

			switch(tester.getHan()){
				case "1":
					if(fu == 30){
						points[0] = "1000";
						points[1] = "500";
						points[2] = "300";
					}else if(fu == 40){
						points[0] = "1300";
						points[1] = "700";
						points[2] = "400";
					}else if(fu == 50){
						points[0] = "1600";
						points[1] = "800";
						points[2] = "400";
					}else if(fu == 60){
						points[0] = "2000";
						points[1] = "1000";
						points[2] = "500";
					}else if(fu == 70){
						points[0] = "2300";
						points[1] = "1200";
						points[2] = "600";
					}else if(fu == 80){
						points[0] = "2600";
						points[1] = "1300";
						points[2] = "700";
					}else if(fu == 90){
						points[0] = "2900";
						points[1] = "1500";
						points[2] = "800";
					}else if(fu == 100){
						points[0] = "3200";
						points[1] = "1600";
						points[2] = "800";
					}else if(fu == 110){
						points[0] = "3600";
						points[1] = "1800";
						points[2] = "900";
					}
					break;
				case "2":
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "700";
						points[2] = "400";
					}else if(fu == 25){
						//2翻25符は七対子のロン上がりのみ
						points[0] = "1600";
						points[1] = null;
						points[2] = null;
					}else if(fu == 30){
						points[0] = "2000";
						points[1] = "1000";
						points[2] = "500";
					}else if(fu == 40){
						points[0] = "2600";
						points[1] = "1300";
						points[2] = "700";
					}else if(fu == 50){
						points[0] = "3200";
						points[1] = "1600";
						points[2] = "800";
					}else if(fu == 60){
						points[0] = "3900";
						points[1] = "2000";
						points[2] = "1000";
					}else if(fu == 70){
						points[0] = "4500";
						points[1] = "2300";
						points[2] = "1200";
					}else if(fu == 80){
						points[0] = "5200";
						points[1] = "2600";
						points[2] = "1300";
					}else if(fu == 90){
						points[0] = "5800";
						points[1] = "2900";
						points[2] = "1500";
					}else if(fu == 100){
						points[0] = "6400";
						points[1] = "3200";
						points[2] = "1600";
					}else if(fu == 110){
						points[0] = "7100";
						points[1] = "3600";
						points[2] = "1800";
					}
					break;
				case "3":
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "1300";
						points[2] = "700";
					}else if(fu == 25){
						points[0] = "3200";
						points[1] = "1600";
						points[2] = "800";
					}else if(fu == 30){
						points[0] = "3900";
						points[1] = "2000";
						points[2] = "1000";
					}else if(fu == 40){
						points[0] = "5200";
						points[1] = "2600";
						points[2] = "1300";
					}else if(fu == 50){
						points[0] = "6400";
						points[1] = "3200";
						points[2] = "1600";
					}else if(fu == 60){
						points[0] = "7700";
						points[1] = "3900";
						points[2] = "2000";
					}else{
						points[0] = "8000";
						points[1] = "4000";
						points[2] = "2000";
					}
					break;
				case "4":
					if(fu == 20){
						//20符はピンフツモしかないのでツモ上がりの点数のみ
						points[0] = null;
						points[1] = "2600";
						points[2] = "1300";
					}else if(fu == 25){
						points[0] = "6400";
						points[1] = "3200";
						points[2] = "1600";
					}else if(fu == 30){
						points[0] = "7700";
						points[1] = "3900";
						points[2] = "2000";
					}else if(fu == 40){
						points[0] = "8000";
						points[1] = "4000";
						points[2] = "2000";
					}
					break;
				case "5":
					//5翻は満貫のみ
					points[0] = "8000";
					points[1] = "4000";
					points[2] = "2000";
					break;
				case "6":
				case "7":
					//6翻、7翻は跳満のみ
					points[0] = "12000";
					points[1] = "6000";
					points[2] = "3000";
					break;
				case "8":
				case "9":
				case "10":
					//8翻、9翻、10翻は倍満のみ
					points[0] = "16000";
					points[1] = "8000";
					points[2] = "4000";
					break;
				case "11":
				case "12":
					//11翻、12翻は3倍満のみ
					points[0] = "24000";
					points[1] = "12000";
					points[2] = "6000";
					break;
				case "13":
					//13翻は役満のみ
					points[0] = "32000";
					points[1] = "16000";
					points[2] = "8000";
					break;
			}
		}

		return points;
	}

}
