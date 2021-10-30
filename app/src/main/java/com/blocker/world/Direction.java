package com.blocker.world;

public enum Direction {
    NORTH,WEST,SOUTH,EAST;

    public static Direction rotateClockWise(Direction direction) {
        if (direction == Direction.NORTH) return WEST;
        else if (direction == Direction.WEST) return SOUTH;
        else if (direction == Direction.SOUTH) return EAST;
        else return NORTH;
    }

    public static Direction rotateCounterClockWise(Direction direction) {
        if (direction == Direction.NORTH) return EAST;
        else if (direction == Direction.EAST) return SOUTH;
        else if (direction == Direction.SOUTH) return WEST;
        else return NORTH;
    }

    public static Direction rotateInOppositeDirection(Direction direction) {
        if (direction == Direction.NORTH) return SOUTH;
        else if (direction == Direction.EAST) return WEST;
        else if (direction == Direction.WEST) return EAST;
        else return NORTH;
    }

   }
