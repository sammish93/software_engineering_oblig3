Software Engineering - Oblig 3

I've managed to automate testing of my Java project after each push. My project uses Gradle and JUnit.

The code for the automated testing is located in /.github/workflows/tests.yml. The workflow is run on each commit to the 'master' branch and it's run on Ubuntu (UNIX/Linux). The steps taken once the workflow are:
  - Changes to the master branch using git checkout
  - Sets up the JDK (17 in this case)
  - Gradle is then staged and set up
  - Gradle is built (gradlew has to be an executable file)
  - Tests are run using Gradle (looks like "./gradlew build" runs the tests, but I included "./gradlew test" as well, just to see)
  - An email is sent out the specified email address informing [myself] about the outcome of the workflow
  
This is an image of a passed outcome (commit #14):

![image](https://user-images.githubusercontent.com/27616540/195942136-c4caaffd-c617-45a2-aa7e-714ed93a098f.png)

... and this is a failed outcome D: (commit #13):

![image](https://user-images.githubusercontent.com/27616540/195942621-a120917a-5cae-43b7-ba9c-b1c6aa2180f9.png)
