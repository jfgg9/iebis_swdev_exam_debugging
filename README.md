# iebis_swdev_exam_debugging
Somebody from administration wanted to create a random phrase generators and created the code that you can find in Main.java for this purpose.

The intention was to transform students email address to something similar but using slashes ("/") instead of dots ("."). Then he wanted to put a random word in front of the result to create weird sentences.

So for an email address like "john.doe.mis2016@ie.edu" the potential outputs should be one of the following sentences:


##Solution
###1st bug: 
Replace the "." with "\\."
###2nd bug:
Change the 2 in the switch so that it includes the third option too. 
###3rd bug:
Add break statements so that it does not go to the last one after starting, so if it starts on the first it repeats until it is on the last. 
###4th bug:
Change the '' for "" because if not it is attempting to create a character and it doesn't work.
