/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.model.type;

import java.util.Collection;

public class GroupType extends Code {
    /**
     * Person
     */
    public static final GroupType PERSON = GroupType.of(ValueSet.PERSON);

    /**
     * Animal
     */
    public static final GroupType ANIMAL = GroupType.of(ValueSet.ANIMAL);

    /**
     * Practitioner
     */
    public static final GroupType PRACTITIONER = GroupType.of(ValueSet.PRACTITIONER);

    /**
     * Device
     */
    public static final GroupType DEVICE = GroupType.of(ValueSet.DEVICE);

    /**
     * Medication
     */
    public static final GroupType MEDICATION = GroupType.of(ValueSet.MEDICATION);

    /**
     * Substance
     */
    public static final GroupType SUBSTANCE = GroupType.of(ValueSet.SUBSTANCE);

    private GroupType(Builder builder) {
        super(builder);
    }

    public static GroupType of(java.lang.String value) {
        return GroupType.builder().value(value).build();
    }

    public static GroupType of(ValueSet value) {
        return GroupType.builder().value(value).build();
    }

    public static String string(java.lang.String value) {
        return GroupType.builder().value(value).build();
    }

    public static Code code(java.lang.String value) {
        return GroupType.builder().value(value).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = id;
        builder.extension.addAll(extension);
        builder.value = value;
        return builder;
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (Builder) super.value(ValueSet.from(value).value());
        }

        public Builder value(ValueSet value) {
            return (Builder) super.value(value.value());
        }

        @Override
        public GroupType build() {
            return new GroupType(this);
        }
    }

    public enum ValueSet {
        /**
         * Person
         */
        PERSON("person"),

        /**
         * Animal
         */
        ANIMAL("animal"),

        /**
         * Practitioner
         */
        PRACTITIONER("practitioner"),

        /**
         * Device
         */
        DEVICE("device"),

        /**
         * Medication
         */
        MEDICATION("medication"),

        /**
         * Substance
         */
        SUBSTANCE("substance");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}