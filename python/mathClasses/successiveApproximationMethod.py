import math

"""##################################################################
   #Program to solve zeros of a function                            #
	* using sucessive aproach me	                                #
	* Hail math classes people!! :)									#

	________________________________________________________________#
   
   #Made By: Ricardo Gomes                                          #
   #University: ISEP                                                #
   #Year: 2017                                                      #
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
		c=(a+b)/2
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
a=0.1

#Value of B
b= 1

#Value of C
c= (a*1.0+b*1.0)/2

#Error CAP
errorObj = 0.05

#Formula to eval
formula =  "x**2-3*x-2*math.log(x)"

print("solver for equation: \n*****" + formula + "*****\n")
print("\nNumber of iterations: " + str(iterationEval(a, b, c, errorObj , formula)))