#include <iostream>
#include <conio.h>
using namespace std;

int main() {
    string title = "Add two numbers";
    cout << title << endl;

    int num1, num2;

    cout << "1st number: ";
    cin >> num1;

    cout << "2nd number: ";
    cin >> num2;

    cout << "Sum " << num1+num2;
    
    getch();
}