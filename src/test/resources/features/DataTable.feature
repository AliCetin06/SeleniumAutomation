#Data table Example
@tag
Feature: verify table data is correct
  
  Tester -Ali

  @1stDatatable
  Scenario: verify Table data no header
    Given user open the datatables website
    Then verify user is on datatables homepage
    Then verify Table datas has following data 
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 11/27/2008 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 10/8/2009  |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 1/11/2009  |
      | Bradley Greer      | Software Engineer             | London        | 41 | 10/12/2012 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 6/6/2011   |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 12/1/2012  |
      | Bruno Nash         | Software Engineer             | London        | 38 | 5/2/2011   |
      | Caesar Vance       | Pre-Sales Support             | New York      | 21 | 12/11/2011 |
      | Cara Stevens       | Sales Assistant               | New York      | 46 | 12/5/2011  |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     | 22 | 3/28/2012  |

  @2ndDatatable
  Scenario: verify Table data with header
    Given user open the datatables website
    Then verify user is on datatables homepage
    Then verify Table datas has following data with header
      | Name               | Position                      | Office        | age | Start date |
      | Airi Satou         | Accountant                    | Tokyo         |  33 | 11/27/2008 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        |  47 | 10/8/2009  |
      | Ashton Cox         | Junior Technical Author       | San Francisco |  66 | 1/11/2009  |
      | Bradley Greer      | Software Engineer             | London        |  41 | 10/12/2012 |
      | Brenden Wagner     | Software Engineer             | San Francisco |  28 | 6/6/2011   |
      | Brielle Williamson | Integration Specialist        | New York      |  61 | 12/1/2012  |
      | Bruno Nash         | Software Engineer             | London        |  38 | 5/2/2011   |
      | Caesar Vance       | Pre-Sales Support             | New York      |  21 | 12/11/2011 |
      | Cara Stevens       | Sales Assistant               | New York      |  46 | 12/5/2011  |
      | Cedric Kelly       | Senior Javascript Developer   | Edinburgh     |  22 | 3/28/2012  |
