Feature:    Users of my api-automation should be able to login to access their homepages

    Scenario:   Users need to be on the custom homepage to perform duties

        Given   the employee is on the login page
        When    the manager enters his correct username
        When    the manager enters his correct password
        When    the employee clicks the login button
        Then    the manager should be logged in to the manager home page



    Scenario:   Users need to be on their custom homepage to perform duties

        Given   the employee is on the login page
        When    the tester enters his correct username
        When    the tester enters his correct password
        When    the employee clicks the login button
        Then    the tester should be logged in to the tester home page


