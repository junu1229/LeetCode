class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        String as;
        as = s.replaceAll("[L,C,D,M]", "");
		if (as.contains("IV")) {
			answer += 4;
		} else if (as.contains("IX")||as.equals("IX")) {
			answer += 9;
		} else {
			answer += as.replaceAll("[X,I]", "").length()*5;
			answer += as.replaceAll("[X,V]", "").length();
		} 
		as = s.replaceAll("[I,V,D,M]", "");
		if (as.contains("XL")) {
			answer += 40;
		} else if (as.contains("XC")) {
			answer += 90;
		} else if(s.contains("IX")){
			answer += (as.replaceAll("[C,L]", "").length()-1)*10;
			answer += as.replaceAll("[C,X]", "").length()*50;
		} else {
			answer += as.replaceAll("[C,L]", "").length()*10;
			answer += as.replaceAll("[C,X]", "").length()*50;
			
		}
		as = s.replaceAll("[I,V,X,L]", "");
		if (as.contains("CD")) {
			answer += 400;
		} else if (as.contains("CM")) {
			answer += 900;
		} else if(s.contains("XC")){
			answer += (as.replaceAll("[D,M]", "").length()-1)*100;
			answer += as.replaceAll("[C,M]", "").length()*500;
		} else {
			answer += as.replaceAll("[D,M]", "").length()*100;
			answer += as.replaceAll("[C,M]", "").length()*500;
		}
		as = s.replaceAll("[I,V,X,L,D]", "");
		if (as.contains("CM")) {
			answer += (as.replaceAll("C", "").length()-1)*1000;
		} else {
			answer += (as.replaceAll("C", "").length())*1000;
		}
        return answer;
    }
}