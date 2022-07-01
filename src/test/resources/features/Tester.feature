Feature:    Testers should be able to update defects so they can monitor their progress

    Scenario: Users need to be on their custom homepage to perform duties

Given   the tester is on the tester's home page
When    the tester receives the status information of the deffect
When    the tester revievs the data for correctness 
When    the deffect data meets the condtions
Then    the tester should update the deffects from pending to accepted

    Scenario: Users need to be on their custom homepage to perform duties

Given   the tester is on the tester's home page
When    the tester receives the status information of the deffect
When    the tester revievs the data for correctness 
When    the deffect data does meet the condtions
Then    the tester should update the deffect from pending to declined
