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
	General formulation of the problem :D 	 #
"""###########################################

#Value of A
a=0.5

#Value of B
b= 1
"""
-----------------------------
#Value of C (Never Change!!!)
-----------------------------
"""
c= (a*1.0+b*1.0)/2

#Error CAP ()
errorObj = 10**(-2)

#Formula to eval
formula =  "math.sin(x)+math.log(x)"


##Printing the resolution
print("Resolucão da formula: \n*****" + formula + "*****\n")
print("\nNumero iterações: " + str(iterationEval(a, b, c, errorObj , formula)))