#include <bits/stdc++.h>
using namespace std;
#define endl '\n'

int main() {
  vector <int> BinaryMessage{           
    100001, 1111010, 1101000, 1101110, 1101011, 1010011, 100000, 101100,
    1101011, 1101000, 1101000, 1100001, 1000100,
  }; 
  int shift = 22;
  string ceasarTextMessage = "";
  for (int m : BinaryMessage){
    int message = m;
    int result = 0, i = 0, rem = 0;
    while (message != 0) {
        rem = message % 10;
        message /= 10;
        result += rem * pow(2, i);
        ++i;
    }
    ceasarTextMessage += (char)result;
  }
  reverse(ceasarTextMessage.begin(), ceasarTextMessage.end());
  string result = "";
  shift = 26 - shift;
  for (int i = 0; i < ceasarTextMessage.length(); i++){
    if(!isalpha(ceasarTextMessage[i]))
        result += ceasarTextMessage[i];
    else if (isupper(ceasarTextMessage[i]))
        result += char(int(ceasarTextMessage[i]+shift-65)%26 +65);
    else
        result += char(int(ceasarTextMessage[i]+shift-97)%26 +97);
  }
  cout << result << endl;
  return 0;
}