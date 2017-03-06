#
import urllib
import re

outputTxt = ""
iterator = 0
returnVat = []
returnName= []
 
for i in range(1, 201):
    link = "https://www.racius.com/empresas-em-portugal/encerradas/" + str(i)
    txt = urllib.urlopen(link).read()
    returnVat += re.findall("NIF [0-9]{9}", txt)
    regexName = r"class=\'title\'>.*<"
    returnName += re.findall(regexName, txt)
print(returnVat)
print("\n:\n")
print(returnName)