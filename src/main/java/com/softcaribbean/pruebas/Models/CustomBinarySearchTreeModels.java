package com.softcaribbean.pruebas.Models;

public class CustomBinarySearchTreeModels<T> {
    private CustomNodoBSTModels<T> root;

    public void addItem(Integer key) {

        if (this.root == null) {
            this.root = new CustomNodoBSTModels<T>(key);
            return;
        }

        CustomNodoBSTModels<T> currentNode = this.root;
        CustomNodoBSTModels<T> newNode = new CustomNodoBSTModels<T>(key);

        while (currentNode != null) {
            if (key < currentNode.getKey()) {
                if (currentNode.getPrev() == null) {
                    currentNode.setPrev(newNode);
                    newNode.setParent(currentNode);
                    break;
                } else {
                    currentNode = currentNode.getPrev();
                }
            } else {
                if (currentNode.getNext() == null) {
                    currentNode.setNext(newNode);
                    newNode.setParent(currentNode);
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }

        }
    }

    public CustomNodoBSTModels<T> getItemByKey(Integer key) {
        CustomNodoBSTModels<T> currentNode = this.root;
        System.out.println("by key : "+currentNode.getKey());

        while (currentNode != null) {
            if (key == currentNode.getKey()) {
                return currentNode;
            }
            if (key < currentNode.getKey()) {
                currentNode = currentNode.getPrev();
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

    public CustomNodoBSTModels<T> findInOrderSuccessor(CustomNodoBSTModels<T> inputNode) {  
        if (getItemByKey(inputNode.getKey()) == null) {
            return null;
        }
        CustomNodoBSTModels<T> successorNode = null;
        Integer searchKey = inputNode.getKey();
        while (successorNode == null) {            
            ++searchKey;
            System.out.println("llave : "+searchKey);
            CustomNodoBSTModels<T> news = getItemByKey(searchKey);
            if (news != null) {
                successorNode = news;
               break;
            }
        }
        
        return successorNode;
    }
}
