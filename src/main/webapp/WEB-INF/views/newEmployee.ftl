<!DOCTYPE HTML>
<html>
<head>
    <title>Guide</title>
    <meta charset="utf-8">
    <#include "/library/CSS/style.ftl">
    <#include "/library/CSS/verticalTab.ftl">
</head>
<body>
<#include "/library/templates/header.ftl">



<div class="line_block" id="add">
    <h2>Add Employee</h2>
    <form name= "employee" action="/newEmployee" method="post">
        <div class="row">
            <div class="col-25">
                <label for="fname">First Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="fname" name="FirstName" placeholder="Name..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="mname">Middle Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="mname" name="MiddleName" placeholder="Middle name..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="lname">Last Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="lname" name="LastName" placeholder="Last name..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="CodeDepartment">Development</label>
            </div>
            <div class="col-75">
                <select id="CodeDepartment" name="CodeDepartment">
                    <option value="1">Development department</option>
                    <option value="2">QA department</option>
                </select>
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="email">Email</label>
            </div>
            <div class="col-75">
                <input type="text" id="email" name="email" placeholder="Email..">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="phone">Phone</label>
            </div>
            <div class="col-75">
                <input type="text" id="phone" name="phone" placeholder="Phone..">
            </div>
        </div>
        <div class="row">
            <input type="submit" value="Submit">
        </div>

    </form>

</div>

</body>
</html>