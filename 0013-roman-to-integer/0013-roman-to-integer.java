class Solution {
    public int romanToInt(String s) {
               int sum = 0, pre = 0;
        char ch = 0;
        for(int i = 0; i < s.length(); i++){
            pre = ch;
            ch = s.charAt(i);
            switch(ch){
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if(pre == 'I')
                     sum = sum + 3;
                    else
                     sum = sum + 5;
                    break;
                case 'X':
                    if(pre == 'I')
                     sum = sum + 8;
                    else
                     sum = sum + 10;
                    break;
                case 'L':
                    if(pre == 'V')
                     sum = sum + 40;
                    if(pre == 'X')
                     sum = sum + 30;
                    else
                    sum = sum + 50;
                    break;
                case 'C':
                    if(pre == 'I')
                     sum = sum + 98;
                    if(pre == 'V')
                     sum = sum + 90;
                    if(pre == 'X')
                     sum = sum + 80;
                    else
                    sum = sum + 100;
                    break;
                case 'D':
                    if(pre == 'V')
                     sum = sum + 490;
                    if(pre == 'X')
                     sum = sum + 480;
                    if(pre == 'L')
                     sum = sum + 400;
                    if(pre == 'C')
                     sum = sum + 300;
                    else
                    sum = sum + 500;
                    break;
                case 'M':
                    if(pre == 'I')
                     sum = sum + 998;
                    if(pre == 'V')
                     sum = sum + 990;
                    if(pre == 'X')
                     sum = sum + 980;
                    if(pre == 'L')
                     sum = sum + 900;
                    if(pre == 'C')
                     sum = sum + 800;
                    else
                    sum  = sum + 1000;
                    break;
             }
        }
        return sum;

    }
}