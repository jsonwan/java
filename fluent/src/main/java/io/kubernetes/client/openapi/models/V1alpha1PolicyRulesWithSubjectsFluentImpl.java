package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

public class V1alpha1PolicyRulesWithSubjectsFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> nonResourceRules;
    private java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> resourceRules;
    private java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> subjects;

    public V1alpha1PolicyRulesWithSubjectsFluentImpl() {
    }

    public V1alpha1PolicyRulesWithSubjectsFluentImpl(io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjects instance) {
        this.withNonResourceRules(instance.getNonResourceRules());
        
        this.withResourceRules(instance.getResourceRules());
        
        this.withSubjects(instance.getSubjects());
    }

    public A addToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(index >= 0 ? index : _visitables.get("nonResourceRules").size(), builder);this.nonResourceRules.add(index >= 0 ? index : nonResourceRules.size(), builder); return (A)this;
    }

    public A setToNonResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("nonResourceRules").size()) { _visitables.get("nonResourceRules").add(builder); } else { _visitables.get("nonResourceRules").set(index, builder);}
        if (index < 0 || index >= nonResourceRules.size()) { nonResourceRules.add(builder); } else { nonResourceRules.set(index, builder);}
         return (A)this;
    }

    public A addToNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... items) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
    }

    public A addAllToNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> items) {
        if (this.nonResourceRules == null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").add(builder);this.nonResourceRules.add(builder);} return (A)this;
    }

    public A removeFromNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... items) {
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
    }

    public A removeAllFromNonResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> items) {
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(item);_visitables.get("nonResourceRules").remove(builder);if (this.nonResourceRules != null) {this.nonResourceRules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromNonResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate) {
        if (nonResourceRules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> each = nonResourceRules.iterator();
        final List visitables = _visitables.get("nonResourceRules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> getNonResourceRules() {
        return build(nonResourceRules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> buildNonResourceRules() {
        return build(nonResourceRules);
    }

    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildNonResourceRule(int index) {
        return this.nonResourceRules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildFirstNonResourceRule() {
        return this.nonResourceRules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildLastNonResourceRule() {
        return this.nonResourceRules.get(nonResourceRules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule buildMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder item: nonResourceRules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withNonResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule> nonResourceRules) {
        if (this.nonResourceRules != null) { _visitables.get("nonResourceRules").removeAll(this.nonResourceRules);}
        if (nonResourceRules != null) {this.nonResourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder>(); for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item : nonResourceRules){this.addToNonResourceRules(item);}} else { this.nonResourceRules = null;} return (A) this;
    }

    public A withNonResourceRules(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule... nonResourceRules) {
        if (this.nonResourceRules != null) {this.nonResourceRules.clear();}
        if (nonResourceRules != null) {for (io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item :nonResourceRules){ this.addToNonResourceRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasNonResourceRules() {
        return nonResourceRules != null && !nonResourceRules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRule() {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> addNewNonResourceRuleLike(io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> setNewNonResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.NonResourceRulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editNonResourceRule(int index) {
        if (nonResourceRules.size() <= index) throw new RuntimeException("Can't edit nonResourceRules. Index exceeds size.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editFirstNonResourceRule() {
        if (nonResourceRules.size() == 0) throw new RuntimeException("Can't edit first nonResourceRules. The list is empty.");
        return setNewNonResourceRuleLike(0, buildNonResourceRule(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editLastNonResourceRule() {
        int index = nonResourceRules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last nonResourceRules. The list is empty.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<A> editMatchingNonResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<nonResourceRules.size();i++) { 
        if (predicate.test(nonResourceRules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching nonResourceRules. No match found.");
        return setNewNonResourceRuleLike(index, buildNonResourceRule(index));
    }

    public A addToResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(index >= 0 ? index : _visitables.get("resourceRules").size(), builder);this.resourceRules.add(index >= 0 ? index : resourceRules.size(), builder); return (A)this;
    }

    public A setToResourceRules(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("resourceRules").size()) { _visitables.get("resourceRules").add(builder); } else { _visitables.get("resourceRules").set(index, builder);}
        if (index < 0 || index >= resourceRules.size()) { resourceRules.add(builder); } else { resourceRules.set(index, builder);}
         return (A)this;
    }

    public A addToResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... items) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
    }

    public A addAllToResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> items) {
        if (this.resourceRules == null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").add(builder);this.resourceRules.add(builder);} return (A)this;
    }

    public A removeFromResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... items) {
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
    }

    public A removeAllFromResourceRules(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> items) {
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item : items) {io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(item);_visitables.get("resourceRules").remove(builder);if (this.resourceRules != null) {this.resourceRules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromResourceRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate) {
        if (resourceRules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> each = resourceRules.iterator();
        final List visitables = _visitables.get("resourceRules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> getResourceRules() {
        return build(resourceRules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> buildResourceRules() {
        return build(resourceRules);
    }

    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildResourceRule(int index) {
        return this.resourceRules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildFirstResourceRule() {
        return this.resourceRules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildLastResourceRule() {
        return this.resourceRules.get(resourceRules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule buildMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder item: resourceRules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder item: resourceRules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withResourceRules(java.util.List<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule> resourceRules) {
        if (this.resourceRules != null) { _visitables.get("resourceRules").removeAll(this.resourceRules);}
        if (resourceRules != null) {this.resourceRules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder>(); for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item : resourceRules){this.addToResourceRules(item);}} else { this.resourceRules = null;} return (A) this;
    }

    public A withResourceRules(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule... resourceRules) {
        if (this.resourceRules != null) {this.resourceRules.clear();}
        if (resourceRules != null) {for (io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item :resourceRules){ this.addToResourceRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasResourceRules() {
        return resourceRules != null && !resourceRules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRule() {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> addNewResourceRuleLike(io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> setNewResourceRuleLike(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.ResourceRulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editResourceRule(int index) {
        if (resourceRules.size() <= index) throw new RuntimeException("Can't edit resourceRules. Index exceeds size.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editFirstResourceRule() {
        if (resourceRules.size() == 0) throw new RuntimeException("Can't edit first resourceRules. The list is empty.");
        return setNewResourceRuleLike(0, buildResourceRule(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editLastResourceRule() {
        int index = resourceRules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last resourceRules. The list is empty.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<A> editMatchingResourceRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<resourceRules.size();i++) { 
        if (predicate.test(resourceRules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching resourceRules. No match found.");
        return setNewResourceRuleLike(index, buildResourceRule(index));
    }

    public A addToSubjects(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder>();}
        io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(index >= 0 ? index : _visitables.get("subjects").size(), builder);this.subjects.add(index >= 0 ? index : subjects.size(), builder); return (A)this;
    }

    public A setToSubjects(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder>();}
        io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);
        if (index < 0 || index >= _visitables.get("subjects").size()) { _visitables.get("subjects").add(builder); } else { _visitables.get("subjects").set(index, builder);}
        if (index < 0 || index >= subjects.size()) { subjects.add(builder); } else { subjects.set(index, builder);}
         return (A)this;
    }

    public A addToSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... items) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder>();}
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A addAllToSubjects(java.util.Collection<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> items) {
        if (this.subjects == null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder>();}
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);_visitables.get("subjects").add(builder);this.subjects.add(builder);} return (A)this;
    }

    public A removeFromSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... items) {
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeAllFromSubjects(java.util.Collection<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> items) {
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item : items) {io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(item);_visitables.get("subjects").remove(builder);if (this.subjects != null) {this.subjects.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromSubjects(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate) {
        if (subjects == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> each = subjects.iterator();
        final List visitables = _visitables.get("subjects");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSubjects instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> getSubjects() {
        return build(subjects);
    }

    public java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> buildSubjects() {
        return build(subjects);
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildSubject(int index) {
        return this.subjects.get(index).build();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildFirstSubject() {
        return this.subjects.get(0).build();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildLastSubject() {
        return this.subjects.get(subjects.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject buildMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder item: subjects) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder item: subjects) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withSubjects(java.util.List<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject> subjects) {
        if (this.subjects != null) { _visitables.get("subjects").removeAll(this.subjects);}
        if (subjects != null) {this.subjects = new java.util.ArrayList<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder>(); for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item : subjects){this.addToSubjects(item);}} else { this.subjects = null;} return (A) this;
    }

    public A withSubjects(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject... subjects) {
        if (this.subjects != null) {this.subjects.clear();}
        if (subjects != null) {for (io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item :subjects){ this.addToSubjects(item);}} return (A) this;
    }

    public java.lang.Boolean hasSubjects() {
        return subjects != null && !subjects.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubject() {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> addNewSubjectLike(io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> setNewSubjectLike(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluentImpl.SubjectsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editSubject(int index) {
        if (subjects.size() <= index) throw new RuntimeException("Can't edit subjects. Index exceeds size.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editFirstSubject() {
        if (subjects.size() == 0) throw new RuntimeException("Can't edit first subjects. The list is empty.");
        return setNewSubjectLike(0, buildSubject(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editLastSubject() {
        int index = subjects.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last subjects. The list is empty.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<A> editMatchingSubject(java.util.function.Predicate<io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder> predicate) {
        int index = -1;
        for (int i=0;i<subjects.size();i++) { 
        if (predicate.test(subjects.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching subjects. No match found.");
        return setNewSubjectLike(index, buildSubject(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1PolicyRulesWithSubjectsFluentImpl that = (V1alpha1PolicyRulesWithSubjectsFluentImpl) o;
        if (nonResourceRules != null ? !nonResourceRules.equals(that.nonResourceRules) :that.nonResourceRules != null) return false;
        if (resourceRules != null ? !resourceRules.equals(that.resourceRules) :that.resourceRules != null) return false;
        if (subjects != null ? !subjects.equals(that.subjects) :that.subjects != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(nonResourceRules,  resourceRules,  subjects,  super.hashCode());
    }

    public class NonResourceRulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.NonResourceRulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder builder;
        private final int index;

            NonResourceRulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(this, item);
                        
            }

            NonResourceRulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1NonResourcePolicyRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PolicyRulesWithSubjectsFluentImpl.this.setToNonResourceRules(index,builder.build());
            }

            public N endNonResourceRule() {
                return and();
            }
    }


    public class ResourceRulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.ResourceRulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder builder;
        private final int index;

            ResourceRulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(this, item);
                        
            }

            ResourceRulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ResourcePolicyRuleBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PolicyRulesWithSubjectsFluentImpl.this.setToResourceRules(index,builder.build());
            }

            public N endResourceRule() {
                return and();
            }
    }


    public class SubjectsNestedImpl<N> extends io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PolicyRulesWithSubjectsFluent.SubjectsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder builder;
        private final int index;

            SubjectsNestedImpl(int index,io.kubernetes.client.openapi.models.FlowcontrolV1alpha1Subject item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(this, item);
                        
            }

            SubjectsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.FlowcontrolV1alpha1SubjectBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PolicyRulesWithSubjectsFluentImpl.this.setToSubjects(index,builder.build());
            }

            public N endSubject() {
                return and();
            }
    }


}
