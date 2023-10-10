#include <stdio.h>
#include <cs50.h>

int main(void){
    printf("hello world 2\n");
    string answer = get_string("name? ");
    printf("hello, %s", answer);
}