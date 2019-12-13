<%-- 
    Document   : index
    Created on : Dec 8, 2019, 1:54:40 PM
    Author     : XV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class ="row">
                <div class ="col-4">
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Question Management</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Test Management</a>
                        </li>

                    </ul>
                </div>
                <div class="col-8">
                    <p>Create test</p>
                    <form>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Test name</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Description</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Test time</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputEmail1">Question Number</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">    
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

