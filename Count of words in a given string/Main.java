#include <stdio.h>
int main()
{
    char s[100];
    int i, words;
    gets(s);

    i = 0;
    words = 1;

    /* Runs a loop till end of string */
    while(s[i] != '\0')
    {
        /* If the current character(str[i]) is white space */
        if(s[i]==' ' || s[i]=='\n' || s[i]=='\t')
        {
            words++;
        }

        i++;
    }

    printf("%d", words);

    return 0;
}