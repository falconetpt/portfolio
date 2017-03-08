import math

"""##################################################################
	Returns the number of iterations needed to solve a root problem	#
	Hail math classes people!! :)									#
"""##################################################################

def iterationEval(a, b, c, errorCap, formula):
	i=-1
	error = 100
	while(error > errorCap):
#	for item in range(1,6):
		x = linePrint(a, b, c, i, formula)
		error = (b-a)/2
		if(x[1] * x[2] > 0):
			b=c
		else:
			a=c
		c=(a*1.0+b*1.0)/2
		i+=1
	return i

"""###########################################
	Prints cute line with all info needed :D #
"""###########################################

def linePrint(a, b, c, i, formula):
	values = [["a: ", a], ["b: ", b],["c: ", c]]
	xAxis = ""
	yAxis = ""
	images = []
	for item in values:
		x=item[1]
		y=eval(formula)
		images.append(y)
		xAxis += "\t" + item[0] + str(x) + "\t"
		yAxis += "F_" + item[0] + str(y) + "\t"

	output = str(i+1) + xAxis + yAxis + "\tErro: " + str((b-a)/2)

	print(output)
	return images


"""###########################################
	General variables of the code	 :D 	 #
"""###########################################

#Value of A
a= float(input("Introduza um valor para o A: (numerico) \n")) #exemple 0.1

#Value of B
b= float(input("Introduza o valor para B: (numerico) \n")) #exemple 1
"""
-----------------------------
#Value of C (Never Change!!!)
-----------------------------
"""
c= (a*1.0+b*1.0)/2

#Error CAP ()
errorObj = float(input("Introduza o erro que pretende obter: (numerico)\n"))

#Formula to evaluate
formula =  str(input("Inserir a formula usada: (string)\n")) # exemple math.sin(x)+math.log(x)


##Printing the resolution
print("Resolucao da formula: \n*****" + formula + "*****\n")
print("\nNumero iteracoes: " + str(iterationEval(a, b, c, errorObj , formula)))