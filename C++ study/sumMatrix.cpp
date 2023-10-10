#include <iostream>
#include <conio.h>
using namespace std;

int main(){
    cout << "Sum Matrix" << endl;

    int i,j,k;

    for(i=1;i<=10;i++){
        for(j=1;j<=10;j++){
            k = i+j;
            cout << i << " + " << j << " = "<< k << endl;
        }
    }

    getch();
}